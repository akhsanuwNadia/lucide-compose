package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwFadingClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                curveTo(14.516048f,3.009465f,16.93103f,3.9912236f,18.74f,5.74f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.74f,5.74f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(21.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,19.794f)
                curveTo(1.5f,16.33f,1.5f,7.670001f,7.5f,4.2060003f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,4.206f)
                curveTo(8.868151f,3.4160051f,10.420149f,3.0000694f,12.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,12.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.775f)
                curveTo(13.3438425f,20.92454f,12.672982f,21.000011f,12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,17.656f)
                curveTo(18.558252f,18.19795f,18.05486f,18.686579f,17.5f,19.112f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                curveTo(20.999027f,12.673095f,20.922548f,13.343957f,20.772f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(16.0f,8.0f)
            }
}

public val LucideIcons.All.RotateCwFadingClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwFadingClock: ImageVector
    @Composable get() = RotateCwFadingClockDefinition.asImageVector()
