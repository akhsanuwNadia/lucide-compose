package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Delete") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,5.0f)
                curveTo(9.503081f,5.000028f,9.023969f,5.185043f,8.656f,5.519f)
                lineTo(2.328f,11.259f)
                curveTo(2.1191533f,11.448544f,2.0000565f,11.717464f,2.0000565f,11.9995f)
                curveTo(2.0000565f,12.281535f,2.1191533f,12.550456f,2.328f,12.74f)
                lineTo(8.656f,18.480999f)
                curveTo(9.023969f,18.814957f,9.503081f,18.999971f,10.0f,19.0f)
                lineTo(20.0f,19.0f)
                curveTo(21.10457f,19.0f,22.0f,18.10457f,22.0f,17.0f)
                lineTo(22.0f,7.0f)
                curveTo(22.0f,5.8954306f,21.10457f,5.0f,20.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(18.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,9.0f)
                lineTo(12.0f,15.0f)
            }
}

public val LucideIcons.All.DeleteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Delete: ImageVector
    @Composable get() = DeleteDefinition.asImageVector()
