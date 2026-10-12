package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesCombined") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,14.638999938964844)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.656000137329102)
                lineTo(20.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,3.0)
                lineTo(13.354000091552734,11.645999908447266)
                curveTo(13.2601957321167,11.740041732788086,13.132827758789062,11.792893409729004,13.0,11.792893409729004)
                curveTo(12.867172241210938,11.792893409729004,12.7398042678833,11.740041732788086,12.645999908447266,11.645999908447266)
                lineTo(9.354000091552734,8.354000091552734)
                curveTo(9.158750534057617,8.158809661865234,8.842249870300293,8.158809661865234,8.647000312805176,8.354000091552734)
                lineTo(2.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.46299934387207)
                lineTo(4.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.656000137329102)
                lineTo(8.0,21.0)
            }
}

public val LucideIcons.All.ChartNoAxesCombinedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesCombined: ImageVector
    @Composable get() = ChartNoAxesCombinedDefinition.asImageVector()
