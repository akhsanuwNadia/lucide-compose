package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouseOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,6.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.218f,18.218f)
                curveTo(16.734818f,21.086529f,13.4818125f,22.568182f,10.3441725f,21.804304f)
                curveTo(7.2065334f,21.040428f,4.998633f,18.229286f,5.0f,15.0f)
                lineTo(5.0f,9.0f)
                curveTo(4.9995265f,7.880226f,5.2676973f,6.776679f,5.782f,5.782f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,13.343f)
                lineTo(19.0f,9.0f)
                curveTo(19.00056f,6.511197f,17.679611f,4.2092543f,15.530553f,2.95399f)
                curveTo(13.3814945f,1.6987256f,10.727544f,1.678931f,8.56f,2.902f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(2.0f,2.0f)
            }
}

public val LucideIcons.All.MouseOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouseOff: ImageVector
    @Composable get() = MouseOffDefinition.asImageVector()
