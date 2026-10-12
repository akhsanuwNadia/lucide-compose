package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PackageSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.27f,18.27f)
                lineTo(22.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,10.498f)
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
                lineTo(13.98f,21.171f)
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
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.5f)
                curveTo(15.995994f,17.395828f,16.471613f,18.225325f,17.246761f,18.6744f)
                curveTo(18.02191f,19.123474f,18.97809f,19.123474f,19.753239f,18.6744f)
                curveTo(20.528387f,18.225325f,21.004005f,17.395828f,21.0f,16.5f)
                curveTo(21.004005f,15.604173f,20.528387f,14.774674f,19.753239f,14.325601f)
                curveTo(18.97809f,13.876526f,18.02191f,13.876526f,17.246761f,14.325601f)
                curveTo(16.471613f,14.774674f,15.995994f,15.604173f,16.0f,16.5f)
            }
}

public val LucideIcons.All.PackageSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PackageSearch: ImageVector
    @Composable get() = PackageSearchDefinition.asImageVector()
