package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanFace") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(7.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                curveTo(8.0,14.0,9.5,16.0,12.0,16.0)
                curveTo(14.5,16.0,16.0,14.0,16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(9.010000228881836,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                lineTo(15.010000228881836,9.0)
            }
}

public val LucideIcons.All.ScanFaceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanFace: ImageVector
    @Composable get() = ScanFaceDefinition.asImageVector()
