package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigLeftDash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,9.0)
                curveTo(12.447714805603027,9.0,12.0,8.552285194396973,12.0,8.0)
                lineTo(12.0,4.706999778747559)
                curveTo(12.00006103515625,4.4209980964660645,11.827805519104004,4.163131237030029,11.563577651977539,4.053674697875977)
                curveTo(11.299349784851074,3.944218158721924,10.995203018188477,4.004735469818115,10.793000221252441,4.206999778747559)
                lineTo(3.8530001640319824,11.14699935913086)
                curveTo(3.6266303062438965,11.373357772827148,3.4994561672210693,11.68037223815918,3.4994561672210693,12.000499725341797)
                curveTo(3.4994561672210693,12.320626258850098,3.6266303062438965,12.627640724182129,3.8530001640319824,12.853999137878418)
                lineTo(10.793000221252441,19.79399871826172)
                curveTo(10.995203018188477,19.99626350402832,11.299349784851074,20.056779861450195,11.563577651977539,19.947324752807617)
                curveTo(11.827805519104004,19.837867736816406,12.00006103515625,19.579999923706055,12.0,19.29399871826172)
                lineTo(12.0,16.0)
                curveTo(12.0,15.447714805603027,12.447714805603027,15.0,13.0,15.0)
                lineTo(15.0,15.0)
                curveTo(15.552285194396973,15.0,16.0,14.552285194396973,16.0,14.0)
                lineTo(16.0,10.0)
                curveTo(16.0,9.447714805603027,15.552285194396973,9.0,15.0,9.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,9.0)
                lineTo(20.0,15.0)
            }
}

public val LucideIcons.All.ArrowBigLeftDashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigLeftDash: ImageVector
    @Composable get() = ArrowBigLeftDashDefinition.asImageVector()
