package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Footprints") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                lineTo(4.0f,13.62f)
                curveTo(4.0f,11.5f,2.97f,10.5f,3.0f,8.0f)
                curveTo(3.03f,5.2799997f,4.49f,2.0f,7.5f,2.0f)
                curveTo(9.37f,2.0f,10.0f,3.8f,10.0f,5.5f)
                curveTo(10.0f,8.61f,8.0f,11.16f,8.0f,14.18f)
                lineTo(8.0f,16.0f)
                curveTo(8.003205f,16.716661f,7.6227098f,17.38026f,7.0025907f,17.73952f)
                curveTo(6.382472f,18.09878f,5.617528f,18.09878f,4.9974093f,17.73952f)
                curveTo(4.3772902f,17.38026f,3.996795f,16.716661f,4.0f,16.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,20.0f)
                lineTo(20.0f,17.619999f)
                curveTo(20.0f,15.499999f,21.03f,14.499999f,21.0f,11.999999f)
                curveTo(20.97f,9.279999f,19.51f,5.999999f,16.5f,5.999999f)
                curveTo(14.63f,6.0f,14.0f,7.8f,14.0f,9.5f)
                curveTo(14.0f,12.61f,16.0f,15.16f,16.0f,18.18f)
                lineTo(16.0f,20.0f)
                curveTo(15.996795f,20.716661f,16.37729f,21.38026f,16.99741f,21.73952f)
                curveTo(17.617527f,22.09878f,18.382473f,22.09878f,19.00259f,21.73952f)
                curveTo(19.62271f,21.38026f,20.003204f,20.716661f,20.0f,20.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,13.0f)
                lineTo(8.0f,13.0f)
            }
}

public val LucideIcons.All.FootprintsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Footprints: ImageVector
    @Composable get() = FootprintsDefinition.asImageVector()
