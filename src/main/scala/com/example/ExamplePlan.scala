package com.example

import kbilling.model._

object ExamplePlan extends BillingPlan {
  val accounts = Map(
    "SpentBone" -> ServiceAccount(Map("SpentBoneSUM" -> Aggregate())),

    "USD" -> PaymentAccount({a =>
      val normRate = BigDecimal(0.1)
      val discountRate = BigDecimal(0.05)
      val t = BigDecimal(4)

      a("SpentBoneSUM") match {
        case x if x <= t => x * normRate
        case x if x > t => t * normRate + (x - t) * discountRate
      }
    })
  )
  val notifications = Set[Notification]()
}
