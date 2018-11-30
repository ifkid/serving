package com.tencent.angel.serving.core

import com.tencent.angel.config.ResourceAllocation
import com.tencent.angel.serving.servables.angel.SavedModelBundle
import com.tencent.angel.serving.serving.SessionBundleConfig

class SavedModelBundleFactory(config: SessionBundleConfig) {

  def createSavedModelBundle(path: StoragePath): SavedModelBundle = {
   new SavedModelBundle
    //todo: Defaults to loading the meta graph def corresponding to the `serve` tag if
    // no `saved_model_tags` are specified.
  }

  def estimateResourceRequirement(path: StoragePath): ResourceAllocation = ???

}
object SavedModelBundleFactory{
  def create(config: SessionBundleConfig): SavedModelBundleFactory = {
    //todo:batcher
    new SavedModelBundleFactory(config)
  }
}
