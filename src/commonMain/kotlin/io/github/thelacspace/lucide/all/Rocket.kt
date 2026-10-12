package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rocket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(12.0f,20.0f)
                curveTo(12.0f,20.0f,15.03f,19.45f,16.0f,18.0f)
                curveTo(17.08f,16.38f,16.0f,13.0f,16.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f,16.5f)
                curveTo(3.0f,17.76f,2.5f,21.5f,2.5f,21.5f)
                curveTo(2.5f,21.5f,6.24f,21.0f,7.5f,19.5f)
                curveTo(8.21f,18.66f,8.2f,17.369999f,7.41f,16.59f)
                curveTo(6.6051073f,15.821765f,5.350828f,15.782972f,4.5f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                curveTo(9.532145f,10.61943f,10.202204f,9.296063f,11.0f,8.05f)
                curveTo(13.369152f,4.2619553f,17.532183f,1.9722886f,22.0f,2.0f)
                curveTo(22.0f,4.7200003f,21.22f,9.5f,16.0f,13.0f)
                curveTo(14.736721f,13.79843f,13.396711f,14.468435f,12.0f,15.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(4.0f,12.0f)
                curveTo(4.0f,12.0f,4.55f,8.97f,6.0f,8.0f)
                curveTo(7.62f,6.92f,11.0f,8.05f,11.0f,8.05f)
            }
}

public val LucideIcons.All.RocketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rocket: ImageVector
    @Composable get() = RocketDefinition.asImageVector()
