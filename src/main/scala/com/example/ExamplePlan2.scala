package com.example

import kbilling.model._

object ExamplePlan2 extends BillingPlan {
  val accounts = Map(
    "Bones" -> ServiceAccount(Map("BonesSUM" -> Aggregate())),
    "CashbackPercent" -> ServiceAccount(Map("CashbackPercentSUM" -> Aggregate())),

    "USD" -> PaymentAccount({a =>
      val normRate = BigDecimal(0.1)
      val cashback: BigDecimal =
        if (a("CashbackPercentSUM") > 0) BigDecimal(1) - BigDecimal(0.01) * a("CashbackPercentSUM")
        else 1

      a("BonesSUM") * normRate * cashback
    })
  )
  val notifications = Set[Notification]()
}
