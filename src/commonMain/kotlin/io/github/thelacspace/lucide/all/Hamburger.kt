package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hamburger") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(4.0f,16.0f)
                curveTo(3.283338f,16.003204f,2.6197395f,15.622709f,2.2604802f,15.002591f)
                curveTo(1.9012209f,14.382472f,1.9012209f,13.617528f,2.2604802f,12.997409f)
                curveTo(2.6197395f,12.377291f,3.283338f,11.996795f,4.0f,12.0f)
                lineTo(20.0f,12.0f)
                curveTo(20.716661f,11.996795f,21.38026f,12.377291f,21.73952f,12.997409f)
                curveTo(22.09878f,13.617528f,22.09878f,14.382472f,21.73952f,15.002591f)
                curveTo(21.38026f,15.622709f,20.716661f,16.003204f,20.0f,16.0f)
                lineTo(15.75f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.0f)
                curveTo(3.8954306f,12.0f,3.0f,11.104569f,3.0f,10.0f)
                curveTo(3.0221589f,6.1462264f,7.045099f,3.031235f,12.0f,3.031235f)
                curveTo(16.9549f,3.031235f,20.97784f,6.1462264f,21.0f,10.0f)
                curveTo(21.0f,11.104569f,20.10457f,12.0f,19.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,16.0f)
                curveTo(3.8954306f,16.0f,3.0f,16.89543f,3.0f,18.0f)
                curveTo(3.0f,19.656855f,4.343146f,21.0f,6.0f,21.0f)
                lineTo(18.0f,21.0f)
                curveTo(19.656855f,21.0f,21.0f,19.656855f,21.0f,18.0f)
                curveTo(21.0f,16.89543f,20.10457f,16.0f,19.0f,16.0f)
                quadTo(19.0f,16.0f,19.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.67f,12.0f)
                lineTo(12.8f,16.6f)
                curveTo(13.224346f,16.91826f,13.757741f,17.054914f,14.282843f,16.9799f)
                curveTo(14.807945f,16.904884f,15.28174f,16.624348f,15.6f,16.2f)
                lineTo(18.75f,12.000001f)
            }
}

public val LucideIcons.All.HamburgerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hamburger: ImageVector
    @Composable get() = HamburgerDefinition.asImageVector()
