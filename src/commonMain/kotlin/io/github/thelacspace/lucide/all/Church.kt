package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Church") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                lineTo(14.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,21.0f)
                lineTo(14.0f,18.0f)
                curveTo(13.995076f,16.898922f,13.1010895f,16.008924f,12.0f,16.008924f)
                curveTo(10.8989105f,16.008924f,10.004924f,16.898922f,10.0f,18.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,9.0f)
                lineTo(21.52f,11.147f)
                curveTo(21.81803f,11.328435f,21.999943f,11.652088f,22.0f,12.001f)
                lineTo(22.0f,19.0f)
                curveTo(22.0f,20.10457f,21.10457f,21.0f,20.0f,21.0f)
                lineTo(4.0f,21.0f)
                curveTo(2.8954306f,21.0f,2.0f,20.10457f,2.0f,19.0f)
                lineTo(2.0f,12.000999f)
                curveTo(2.000058f,11.652087f,2.181971f,11.328434f,2.48f,11.146999f)
                lineTo(6.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,21.0f)
                lineTo(6.0f,7.0f)
                curveTo(5.999825f,6.6957026f,6.138214f,6.4078817f,6.376f,6.218f)
                lineTo(11.375999f,2.2189999f)
                curveTo(11.741379f,1.9273254f,12.260087f,1.9277407f,12.624999f,2.2199998f)
                lineTo(17.625f,6.22f)
                curveTo(17.861864f,6.409642f,17.999811f,6.6965723f,18.0f,7.0f)
                lineTo(18.0f,21.0f)
            }
}

public val LucideIcons.All.ChurchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Church: ImageVector
    @Composable get() = ChurchDefinition.asImageVector()
