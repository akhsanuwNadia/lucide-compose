package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dam") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,11.3100004196167)
                curveTo(12.170000076293945,11.870000839233398,12.539999961853027,13.0,14.5,13.0)
                curveTo(17.0,13.0,17.0,11.0,19.5,11.0)
                curveTo(20.799999237060547,11.0,21.399999618530273,11.5,22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.75,18.0)
                curveTo(12.100000381469727,18.5,13.199999809265137,19.0,14.5,19.0)
                curveTo(17.0,19.0,17.0,17.0,19.5,17.0)
                curveTo(20.799999237060547,17.0,21.399999618530273,17.5,22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(6.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,18.0)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                curveTo(6.4477152824401855,3.0,6.0,3.4477152824401855,6.0,4.0)
                lineTo(6.0,20.0)
                curveTo(6.0,20.552284240722656,6.4477152824401855,21.0,7.0,21.0)
                lineTo(11.0,21.0)
                curveTo(11.552285194396973,21.0,12.0,20.552284240722656,12.0,20.0)
                lineTo(10.0,4.0)
                curveTo(10.0,3.4477152824401855,9.552285194396973,3.0,9.0,3.0)
                close()
            }
}

public val LucideIcons.All.DamDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dam: ImageVector
    @Composable get() = DamDefinition.asImageVector()
