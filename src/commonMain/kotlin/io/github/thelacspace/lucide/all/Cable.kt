package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cable") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,19.0f)
                curveTo(16.447716f,19.0f,16.0f,18.552284f,16.0f,18.0f)
                lineTo(16.0f,16.0f)
                curveTo(16.0f,14.895431f,16.89543f,14.0f,18.0f,14.0f)
                lineTo(20.0f,14.0f)
                curveTo(21.10457f,14.0f,22.0f,14.895431f,22.0f,16.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,18.552284f,21.552284f,19.0f,21.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(17.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,14.0f)
                lineTo(19.0f,6.5f)
                curveTo(18.991383f,4.573113f,17.426907f,3.0156176f,15.5f,3.0156176f)
                curveTo(13.573094f,3.0156176f,12.008617f,4.573113f,12.0f,6.5f)
                lineTo(12.0f,17.5f)
                curveTo(11.991383f,19.426888f,10.426906f,20.984383f,8.5f,20.984383f)
                curveTo(6.573094f,20.984383f,5.0086174f,19.426888f,5.0f,17.5f)
                lineTo(5.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,9.104569f,2.0f,8.0f)
                lineTo(2.0f,6.0f)
                curveTo(2.0f,5.4477153f,2.4477153f,5.0f,3.0f,5.0f)
                lineTo(7.0f,5.0f)
                curveTo(7.5522847f,5.0f,8.0f,5.4477153f,8.0f,6.0f)
                lineTo(8.0f,8.0f)
                curveTo(8.0f,9.104569f,7.1045694f,10.0f,6.0f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,5.0f)
                lineTo(7.0f,3.0f)
            }
}

public val LucideIcons.All.CableDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cable: ImageVector
    @Composable get() = CableDefinition.asImageVector()
