package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCwOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(18.739999771118164,5.739999771118164)
                curveTo(16.9310302734375,3.9912235736846924,14.516048431396484,3.009464979171753,12.0,3.0)
                curveTo(11.0,3.0,10.029999732971191,3.1600000858306885,9.130000114440918,3.4700000286102295)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(3.0,16.0)
                lineTo(3.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0,9.510000228881836,4.0,7.260000228881836,5.639999866485596,5.639999866485596)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,16.0)
                lineTo(5.260000228881836,18.260000228881836)
                curveTo(7.068969249725342,20.00877571105957,9.483951568603516,20.990535736083984,12.0,21.0)
                curveTo(14.489999771118164,21.0,16.739999771118164,20.0,18.360000610351562,18.360000610351562)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                curveTo(21.0,13.0,20.84000015258789,13.970000267028809,20.530000686645508,14.869999885559082)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(21.0,8.0)
                lineTo(16.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(2.0,2.0)
            }
}

public val LucideIcons.All.RefreshCwOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCwOff: ImageVector
    @Composable get() = RefreshCwOffDefinition.asImageVector()
