package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaveOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,13.0f)
                lineTo(8.0f,13.0f)
                curveTo(7.4477153f,13.0f,7.0f,13.447715f,7.0f,14.0f)
                lineTo(7.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                lineTo(15.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(17.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.41f,20.41f)
                curveTo(20.03665f,20.785587f,19.529577f,20.997766f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0022328f,4.470423f,3.2144122f,3.9633505f,3.59f,3.5900002f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.0f)
                lineTo(15.2f,3.0f)
                curveTo(15.727538f,3.007514f,16.23074f,3.2231712f,16.6f,3.6f)
                lineTo(20.4f,7.3999996f)
                curveTo(20.776829f,7.7692604f,20.992485f,8.272461f,21.0f,8.799999f)
                lineTo(21.0f,15.0f)
            }
}

public val LucideIcons.All.SaveOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaveOff: ImageVector
    @Composable get() = SaveOffDefinition.asImageVector()
