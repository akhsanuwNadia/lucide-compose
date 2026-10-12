package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Helicopter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,17.0)
                lineTo(11.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                lineTo(14.0,11.0)
                curveTo(14.0,12.104569435119629,14.895430564880371,13.0,16.0,13.0)
                lineTo(21.864999771118164,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,17.0)
                curveTo(20.209138870239258,17.0,22.0,15.209138870239258,22.0,13.0)
                curveTo(22.0,9.686291694641113,18.418277740478516,7.0,14.0,7.0)
                curveTo(10.686291694641113,7.0,8.0,9.23857593536377,8.0,12.0)
                lineTo(8.0,15.0)
                curveTo(8.0,16.104570388793945,8.895430564880371,17.0,10.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(2.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                lineTo(22.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,13.0)
                lineTo(2.0,13.0)
            }
}

public val LucideIcons.All.HelicopterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Helicopter: ImageVector
    @Composable get() = HelicopterDefinition.asImageVector()
