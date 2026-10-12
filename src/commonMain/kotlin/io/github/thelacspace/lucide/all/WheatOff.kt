package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WheatOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                lineTo(14.83f,9.17f)
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
                moveTo(8.0f,8.0f)
                lineTo(7.4700003f,8.53f)
                curveTo(6.109651f,9.895712f,6.109651f,12.104287f,7.4700003f,13.469999f)
                lineTo(9.0f,15.0f)
                lineTo(10.53f,13.47f)
                curveTo(11.08f,12.92f,11.41f,12.22f,11.51f,11.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.91f,5.26f)
                curveTo(11.059999f,5.0f,11.25f,4.75f,11.47f,4.53f)
                lineTo(13.0f,3.0f)
                lineTo(14.53f,4.5299997f)
                curveTo(15.77361f,5.77968f,15.893586f,7.7592773f,14.809999f,9.15f)
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
                moveTo(16.0f,16.0f)
                lineTo(15.47f,16.53f)
                curveTo(14.104288f,17.89035f,11.895713f,17.89035f,10.530001f,16.53f)
                lineTo(9.0f,15.0f)
                lineTo(10.53f,13.47f)
                curveTo(11.06382f,12.939464f,11.754843f,12.595706f,12.5f,12.49f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.74f,13.09f)
                curveTo(19.0f,12.940001f,19.25f,12.75f,19.47f,12.53f)
                lineTo(21.0f,11.0f)
                lineTo(19.47f,9.47f)
                curveTo(18.22032f,8.22639f,16.24072f,8.106414f,14.849999f,9.190001f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.WheatOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WheatOff: ImageVector
    @Composable get() = WheatOffDefinition.asImageVector()
