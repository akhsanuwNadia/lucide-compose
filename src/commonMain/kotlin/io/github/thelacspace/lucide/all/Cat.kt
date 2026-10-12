package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                curveTo(12.67f,5.0f,13.35f,5.09f,14.0f,5.26f)
                curveTo(15.78f,3.2600002f,19.03f,2.4200003f,20.42f,3.0000002f)
                curveTo(21.82f,3.5800002f,20.0f,10.0f,20.0f,10.0f)
                curveTo(20.57f,11.07f,21.0f,12.24f,21.0f,13.440001f)
                curveTo(21.0f,17.9f,16.97f,21.0f,12.0f,21.0f)
                curveTo(7.0300007f,21.0f,3.0f,18.0f,3.0f,13.440001f)
                curveTo(3.0f,12.190001f,3.5f,11.040001f,4.0f,10.0f)
                curveTo(4.0f,10.0f,2.1100001f,3.58f,3.5f,3.0f)
                curveTo(4.89f,2.42f,8.219999f,3.23f,10.0f,5.23f)
                curveTo(10.656024f,5.0791087f,11.326849f,5.0019636f,12.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                lineTo(8.0f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(16.0f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.25f,16.25f)
                lineTo(12.75f,16.25f)
                lineTo(12.0f,17.0f)
                lineTo(11.25f,16.25f)
                close()
            }
}

public val LucideIcons.All.CatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cat: ImageVector
    @Composable get() = CatDefinition.asImageVector()
