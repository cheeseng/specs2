package org.specs2.control

import concurrent.forkjoin.ForkJoinPool

object Specs2ForkJoin {
  def pool =
    new ForkJoinPool(Runtime.getRuntime.availableProcessors,
                     NamedForkJoinWorkerThreadFactory.specs2, Thread.currentThread.getThreadGroup, false)

}
