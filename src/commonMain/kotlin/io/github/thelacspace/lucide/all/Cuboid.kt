package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cuboid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                lineTo(10.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.336f,8.89f)
                lineTo(10.0f,14.0f)
                lineTo(21.715f,6.971f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,14.0f)
                curveTo(22.000006f,14.702529f,21.63141f,15.353549f,21.029f,15.715f)
                lineTo(11.028999f,21.715f)
                curveTo(10.366513f,22.112751f,9.534167f,22.093287f,8.890999f,21.665f)
                lineTo(2.8909988f,17.665f)
                curveTo(2.334184f,17.293983f,1.9997878f,16.669102f,2.0f,16.0f)
                lineTo(2.0f,10.0f)
                curveTo(1.9999932f,9.297471f,2.368588f,8.646451f,2.971f,8.285f)
                lineTo(12.971f,2.2849998f)
                curveTo(13.633486f,1.8872496f,14.465832f,1.9067152f,15.108999f,2.3349998f)
                lineTo(21.109f,6.335f)
                curveTo(21.665815f,6.7060165f,22.000212f,7.330899f,22.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.CuboidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cuboid: ImageVector
    @Composable get() = CuboidDefinition.asImageVector()
