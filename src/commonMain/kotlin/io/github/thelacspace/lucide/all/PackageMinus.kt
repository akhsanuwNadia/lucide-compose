package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PackageMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(22.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,13.0f)
                lineTo(21.0f,8.0f)
                curveTo(20.999268f,7.2862015f,20.618168f,6.626899f,20.0f,6.27f)
                lineTo(13.0f,2.27f)
                curveTo(12.381198f,1.9127344f,11.618802f,1.9127344f,11.0f,2.27f)
                lineTo(4.0f,6.27f)
                curveTo(3.381832f,6.626899f,3.0007322f,7.2862015f,3.0f,8.0f)
                lineTo(3.0f,16.0f)
                curveTo(3.0010886f,16.713442f,3.3821406f,17.37228f,4.0f,17.729f)
                lineTo(11.0f,21.729f)
                curveTo(11.618624f,22.086575f,12.38102f,22.086956f,13.0f,21.73f)
                lineTo(14.675f,20.775f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.29f,7.0f)
                lineTo(12.0f,12.0f)
                lineTo(20.71f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,4.27f)
                lineTo(16.497f,9.417999f)
            }
}

public val LucideIcons.All.PackageMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PackageMinus: ImageVector
    @Composable get() = PackageMinusDefinition.asImageVector()
