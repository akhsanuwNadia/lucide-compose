package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.01f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,16.429f)
                curveTo(10.444218f,14.523287f,13.555782f,14.523287f,15.5f,16.429f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.859f)
                curveTo(6.4180274f,11.468908f,8.217809f,10.532466f,10.17f,10.169001f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,12.859f)
                curveTo(18.397882f,12.268751f,17.723532f,11.757025f,16.993f,11.336f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,8.82f)
                curveTo(3.2365966f,7.714075f,4.64809f,6.820952f,6.177f,6.177f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,8.82f)
                curveTo(18.917171f,6.0627646f,14.83268f,4.7007856f,10.712f,5.0559998f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.WifiOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiOff: ImageVector
    @Composable get() = WifiOffDefinition.asImageVector()
