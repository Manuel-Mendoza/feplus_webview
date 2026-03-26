package com.bumptech.glide

import android.content.Context
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import top.rootu.lampa.LampaGlideModule

internal class GeneratedAppGlideModuleImpl(
  @Suppress("UNUSED_PARAMETER")
  context: Context,
) : GeneratedAppGlideModule() {
  private val appGlideModule: LampaGlideModule
  init {
    appGlideModule = LampaGlideModule()
  }

  public override fun registerComponents(
    context: Context,
    glide: Glide,
    registry: Registry,
  ): Unit {
    appGlideModule.registerComponents(context, glide, registry)
  }

  public override fun applyOptions(context: Context, builder: GlideBuilder): Unit {
    appGlideModule.applyOptions(context, builder)
  }

  public override fun isManifestParsingEnabled(): Boolean = false
}
