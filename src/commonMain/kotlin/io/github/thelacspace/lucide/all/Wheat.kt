package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wheat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(16.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.47f,12.53f)
                lineTo(5.0f,11.0f)
                lineTo(6.5299997f,12.53f)
                curveTo(7.890349f,13.895712f,7.890349f,16.104286f,6.5299997f,17.47f)
                lineTo(5.0f,19.0f)
                lineTo(3.47f,17.47f)
                curveTo(2.1096501f,16.104286f,2.1096501f,13.895712f,3.47f,12.529999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.47f,8.53f)
                lineTo(9.0f,7.0f)
                lineTo(10.53f,8.53f)
                curveTo(11.890349f,9.895712f,11.890349f,12.104287f,10.53f,13.469999f)
                lineTo(9.0f,15.0f)
                lineTo(7.4700003f,13.47f)
                curveTo(6.109651f,12.104288f,6.109651f,9.895713f,7.4700003f,8.530001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.47f,4.53f)
                lineTo(13.0f,3.0f)
                lineTo(14.53f,4.5299997f)
                curveTo(15.890349f,5.8957124f,15.890349f,8.104287f,14.53f,9.469999f)
                lineTo(13.0f,11.0f)
                lineTo(11.47f,9.47f)
                curveTo(10.109651f,8.104288f,10.109651f,5.895713f,11.47f,4.53f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,2.0f)
                lineTo(22.0f,2.0f)
                lineTo(22.0f,4.0f)
                curveTo(22.0f,6.209139f,20.209139f,8.0f,18.0f,8.0f)
                lineTo(16.0f,8.0f)
                lineTo(16.0f,6.0f)
                curveTo(16.0f,3.790861f,17.790861f,2.0f,20.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.47f,17.47f)
                lineTo(13.0f,19.0f)
                lineTo(11.47f,20.53f)
                curveTo(10.104288f,21.89035f,7.895713f,21.89035f,6.53f,20.53f)
                lineTo(5.0f,19.0f)
                lineTo(6.5299997f,17.47f)
                curveTo(7.8957124f,16.10965f,10.104287f,16.10965f,11.469999f,17.47f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.47f,13.47f)
                lineTo(17.0f,15.0f)
                lineTo(15.47f,16.53f)
                curveTo(14.104288f,17.89035f,11.895713f,17.89035f,10.530001f,16.53f)
                lineTo(9.0f,15.0f)
                lineTo(10.53f,13.47f)
                curveTo(11.895712f,12.109651f,14.104287f,12.109651f,15.469999f,13.47f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(19.47f,9.47f)
                lineTo(21.0f,11.0f)
                lineTo(19.47f,12.53f)
                curveTo(18.104286f,13.890349f,15.895712f,13.890349f,14.529999f,12.53f)
                lineTo(13.0f,11.0f)
                lineTo(14.53f,9.47f)
                curveTo(15.895712f,8.109651f,18.104286f,8.109651f,19.47f,9.47f)
                close()
            }
}

public val LucideIcons.All.WheatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wheat: ImageVector
    @Composable get() = WheatDefinition.asImageVector()
