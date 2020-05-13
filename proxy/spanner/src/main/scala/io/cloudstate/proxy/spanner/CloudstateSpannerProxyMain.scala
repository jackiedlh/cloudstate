package io.cloudstate.proxy.spanner

import io.cloudstate.proxy.CloudStateProxyMain

object CloudstateSpannerProxyMain {

  def main(args: Array[String]): Unit = {
    // TODO Check that tables have been created!
    val actorSystem = CloudStateProxyMain.start()
  }
}
