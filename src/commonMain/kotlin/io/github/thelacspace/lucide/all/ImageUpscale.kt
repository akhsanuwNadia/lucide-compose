package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageUpscale") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(20.10457f,21.0f,21.0f,20.10457f,21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                lineTo(21.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(16.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                lineTo(9.144f,16.855999f)
                curveTo(9.370952f,16.628836f,9.678891f,16.501198f,10.0f,16.501198f)
                curveTo(10.321109f,16.501198f,10.629048f,16.628836f,10.856f,16.855999f)
                lineTo(13.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.0f)
                lineTo(12.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,11.0f)
                lineTo(12.0f,11.0f)
                lineTo(13.0f,11.0f)
                lineTo(13.0f,21.0f)
                lineTo(12.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,11.0f)
                lineTo(4.0f,11.0f)
                close()
            }
}

public val LucideIcons.All.ImageUpscaleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageUpscale: ImageVector
    @Composable get() = ImageUpscaleDefinition.asImageVector()
