package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,10.0f)
                lineTo(11.0f,14.0f)
                lineTo(15.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,14.0f)
                lineTo(12.535f,12.395f)
                curveTo(13.699688f,11.275639f,15.333415f,10.787929f,16.921133f,11.085626f)
                curveTo(18.50885f,11.383323f,19.854927f,12.429746f,20.535f,13.895f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,18.0f)
                lineTo(19.465f,19.605f)
                curveTo(18.300312f,20.724361f,16.666586f,21.212072f,15.078867f,20.914375f)
                curveTo(13.49115f,20.616678f,12.145073f,19.570255f,11.465f,18.105f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,22.0f)
                lineTo(21.0f,18.0f)
                lineTo(17.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.517f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(8.517f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(7.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,5.0f)
            }
}

public val LucideIcons.All.CalendarSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarSync: ImageVector
    @Composable get() = CalendarSyncDefinition.asImageVector()
