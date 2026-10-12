package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f,21.0f)
                curveTo(10.625278f,21.618752f,11.285504f,21.999912f,12.0f,21.999912f)
                curveTo(12.714495f,21.999912f,13.374721f,21.618752f,13.731999f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,17.0f)
                lineTo(4.0f,17.0f)
                curveTo(3.6040373f,17.000141f,3.2452834f,16.766636f,3.0851107f,16.404514f)
                curveTo(2.924938f,16.042395f,2.993517f,15.61987f,3.26f,15.327f)
                curveTo(4.59f,13.956f,6.0f,12.499f,6.0f,8.0f)
                curveTo(5.999855f,7.4098043f,6.086791f,6.822817f,6.258f,6.258f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.668f,3.01f)
                curveTo(10.50892f,1.7806958f,12.877155f,1.6648821f,14.829237f,2.7086976f)
                curveTo(16.781319f,3.752513f,18.000086f,5.786367f,18.0f,8.0f)
                curveTo(18.0f,10.687f,18.77f,12.653f,19.707f,14.05f)
            }
}

public val LucideIcons.All.BellOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellOff: ImageVector
    @Composable get() = BellOffDefinition.asImageVector()
