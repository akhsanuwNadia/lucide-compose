package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WandSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.64f,3.64f)
                lineTo(20.359999f,2.3600001f)
                curveTo(20.132732f,2.130377f,19.823074f,2.001176f,19.5f,2.001176f)
                curveTo(19.176924f,2.001176f,18.867266f,2.130377f,18.64f,2.3600001f)
                lineTo(2.36f,18.64f)
                curveTo(2.1303768f,18.867266f,2.0011759f,19.176924f,2.0011759f,19.5f)
                curveTo(2.0011759f,19.823074f,2.1303768f,20.132732f,2.36f,20.359999f)
                lineTo(3.6399999f,21.64f)
                curveTo(3.8659098f,21.872145f,4.1760755f,22.0031f,4.5f,22.0031f)
                curveTo(4.823924f,22.0031f,5.13409f,21.872145f,5.3599997f,21.64f)
                lineTo(21.64f,5.36f)
                curveTo(21.872145f,5.1340904f,22.0031f,4.8239245f,22.0031f,4.5f)
                curveTo(22.0031f,4.176076f,21.872145f,3.86591f,21.64f,3.64f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,7.0f)
                lineTo(17.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,6.0f)
                lineTo(5.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,14.0f)
                lineTo(19.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,8.0f)
                lineTo(3.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,16.0f)
                lineTo(17.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,3.0f)
                lineTo(9.0f,3.0f)
            }
}

public val LucideIcons.All.WandSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WandSparkles: ImageVector
    @Composable get() = WandSparklesDefinition.asImageVector()
