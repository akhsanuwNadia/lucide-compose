package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,8.82f)
                curveTo(7.694013f,3.7271194f,16.305986f,3.7271194f,22.0f,8.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,16.0f)
                lineTo(20.0f,14.0f)
                curveTo(19.995075f,12.898922f,19.10109f,12.0089245f,18.0f,12.0089245f)
                curveTo(16.89891f,12.0089245f,16.004925f,12.898922f,16.0f,14.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.859f)
                curveTo(7.228027f,10.674516f,10.348027f,9.655227f,13.436f,10.103001f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,16.429f)
                curveTo(9.010344f,15.928418f,9.622096f,15.54309f,10.294f,15.299001f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,16.0f)
                lineTo(21.0f,16.0f)
                lineTo(22.0f,16.0f)
                lineTo(22.0f,21.0f)
                lineTo(21.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(14.0f,21.0f)
                lineTo(14.0f,16.0f)
                lineTo(15.0f,16.0f)
                close()
            }
}

public val LucideIcons.All.WifiLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiLock: ImageVector
    @Composable get() = WifiLockDefinition.asImageVector()
