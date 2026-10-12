package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Package") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,21.73f)
                curveTo(11.618802f,22.087265f,12.381198f,22.087265f,13.0f,21.73f)
                lineTo(20.0f,17.73f)
                curveTo(20.618168f,17.3731f,20.999268f,16.713799f,21.0f,16.0f)
                lineTo(21.0f,8.0f)
                curveTo(20.999268f,7.2862015f,20.618168f,6.626899f,20.0f,6.27f)
                lineTo(13.0f,2.27f)
                curveTo(12.381198f,1.9127344f,11.618802f,1.9127344f,11.0f,2.27f)
                lineTo(4.0f,6.27f)
                curveTo(3.381832f,6.626899f,3.0007322f,7.2862015f,3.0f,8.0f)
                lineTo(3.0f,16.0f)
                curveTo(3.0007324f,16.713799f,3.3818321f,17.3731f,4.0f,17.73f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.29f,7.0f)
                lineTo(12.0f,12.0f)
                lineTo(20.71f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,4.27f)
                lineTo(16.5f,9.42f)
            }
}

public val LucideIcons.All.PackageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Package: ImageVector
    @Composable get() = PackageDefinition.asImageVector()
