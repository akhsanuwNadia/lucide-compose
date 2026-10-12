package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunSnow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,21.0f)
                lineTo(10.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                lineTo(10.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                curveTo(8.348383f,9.007386f,7.0133862f,10.348366f,7.0133862f,12.0f)
                curveTo(7.0133862f,13.651634f,8.348383f,14.992614f,10.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.0f)
                lineTo(15.25f,17.5f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(15.25f,6.5f)
                lineTo(18.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(14.0f,15.0f)
                lineTo(15.5f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(14.0f,9.0f)
                lineTo(15.5f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                lineTo(18.5f,12.0f)
                lineTo(20.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.64f,18.36f)
                lineTo(4.34f,17.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.34f,6.34f)
                lineTo(3.64f,5.6400003f)
            }
}

public val LucideIcons.All.SunSnowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunSnow: ImageVector
    @Composable get() = SunSnowDefinition.asImageVector()
