package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blender") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                curveTo(7.0437126f,13.999805f,6.221085f,14.676598f,6.0369997f,15.615f)
                lineTo(5.0189996f,20.807999f)
                curveTo(4.9616313f,21.101229f,5.03839f,21.40475f,5.228258f,21.635458f)
                curveTo(5.418126f,21.866163f,5.70121f,21.999882f,6.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(18.29879f,21.999882f,18.581873f,21.866163f,18.771742f,21.635458f)
                curveTo(18.961609f,21.404753f,19.038368f,21.10123f,18.981f,20.808f)
                lineTo(17.963001f,15.615001f)
                curveTo(17.778915f,14.676598f,16.956287f,13.999805f,16.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.006f,14.0f)
                lineTo(7.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.565f,8.787f)
                curveTo(9.084471f,9.2431135f,10.730237f,8.95107f,12.0f,8.0f)
                curveTo(13.306356f,7.020427f,15.008719f,6.740433f,16.56f,7.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,2.0f)
                lineTo(5.0f,2.0f)
                curveTo(3.8954306f,2.0f,3.0f,2.8954306f,3.0f,4.0f)
                lineTo(3.0f,9.0f)
                curveTo(3.0027466f,9.575719f,3.2534592f,10.122331f,3.688f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.01f,18.0f)
            }
}

public val LucideIcons.All.BlenderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blender: ImageVector
    @Composable get() = BlenderDefinition.asImageVector()
