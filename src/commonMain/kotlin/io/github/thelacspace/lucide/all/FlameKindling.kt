package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlameKindling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                curveTo(13.0f,5.0f,14.5f,5.5f,15.5f,6.5f)
                curveTo(16.442072f,7.4231524f,16.981215f,8.681153f,17.0f,10.0f)
                curveTo(17.008013f,11.791655f,16.056774f,13.450651f,14.506477f,14.3488f)
                curveTo(12.956181f,15.246948f,11.043819f,15.246948f,9.493523f,14.3488f)
                curveTo(7.943226f,13.450651f,6.991987f,11.791655f,7.0f,10.0f)
                curveTo(7.0f,9.7f,7.0f,9.4f,7.1f,9.1f)
                curveTo(7.331643f,9.910666f,8.046787f,10.489004f,8.887975f,10.5459385f)
                curveTo(9.729162f,10.602873f,10.515715f,10.126175f,10.854482f,9.354116f)
                curveTo(11.19325f,8.582058f,11.011468f,7.680469f,10.4f,7.1000004f)
                curveTo(8.0f,4.5f,11.0f,2.0f,12.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,22.0f)
                lineTo(19.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                lineTo(19.0f,22.0f)
            }
}

public val LucideIcons.All.FlameKindlingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlameKindling: ImageVector
    @Composable get() = FlameKindlingDefinition.asImageVector()
