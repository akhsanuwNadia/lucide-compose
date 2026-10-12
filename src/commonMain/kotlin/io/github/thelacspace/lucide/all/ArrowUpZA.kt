package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpZA") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,8.0)
                lineTo(7.0,4.0)
                lineTo(11.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,4.0)
                lineTo(7.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                lineTo(20.0,4.0)
                lineTo(15.0,10.0)
                lineTo(20.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,20.0)
                lineTo(15.0,16.5)
                curveTo(15.006155014038086,15.123652458190918,16.123638153076172,14.011155128479004,17.5,14.011155128479004)
                curveTo(18.876361846923828,14.011155128479004,19.993844985961914,15.123652458190918,20.0,16.5)
                lineTo(20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,18.0)
                lineTo(15.0,18.0)
            }
}

public val LucideIcons.All.ArrowUpZADefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpZA: ImageVector
    @Composable get() = ArrowUpZADefinition.asImageVector()
