package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Aperture") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9839749f,15.583309f,3.8864517f,18.901302f,6.987046f,20.6976f)
                curveTo(10.08764f,22.493896f,13.91236f,22.493896f,17.012955f,20.6976f)
                curveTo(20.113548f,18.901302f,22.016026f,15.583309f,22.0f,12.0f)
                curveTo(22.016026f,8.416691f,20.113548f,5.0986977f,17.012955f,3.302401f)
                curveTo(13.91236f,1.5061044f,10.08764f,1.5061044f,6.987046f,3.302401f)
                curveTo(3.8864517f,5.0986977f,1.9839749f,8.416691f,2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.31f,8.0f)
                lineTo(20.05f,17.939999f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.69f,8.0f)
                lineTo(21.169998f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.38f,12.0f)
                lineTo(13.12f,2.0600004f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.69f,16.0f)
                lineTo(3.95f,6.06f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.31f,16.0f)
                lineTo(2.83f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.62f,12.0f)
                lineTo(10.880001f,21.939999f)
            }
}

public val LucideIcons.All.ApertureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Aperture: ImageVector
    @Composable get() = ApertureDefinition.asImageVector()
