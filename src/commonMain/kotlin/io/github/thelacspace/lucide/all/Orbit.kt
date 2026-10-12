package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Orbit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.341f,6.484f)
                curveTo(22.546066f,9.816975f,22.555002f,14.142773f,20.363722f,17.484827f)
                curveTo(18.172441f,20.826883f,14.201768f,22.543377f,10.266f,21.85f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.659f,17.516f)
                curveTo(1.4539473f,14.182123f,1.4460064f,9.855405f,3.6388068f,6.513456f)
                curveTo(5.831607f,3.1715071f,9.803871f,1.4563773f,13.74f,2.152f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                curveTo(8.995193f,13.074993f,9.565935f,14.070391f,10.496114f,14.60928f)
                curveTo(11.426291f,15.148169f,12.573709f,15.148169f,13.503886f,14.60928f)
                curveTo(14.434065f,14.070391f,15.004807f,13.074993f,15.0f,12.0f)
                curveTo(15.004807f,10.925007f,14.434065f,9.929609f,13.503886f,9.39072f)
                curveTo(12.573709f,8.851831f,11.426291f,8.851831f,10.496114f,9.39072f)
                curveTo(9.565935f,9.929609f,8.995193f,10.925007f,9.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,5.0f)
                curveTo(16.996796f,5.716662f,17.37729f,6.3802605f,17.99741f,6.7395196f)
                curveTo(18.617527f,7.098779f,19.382473f,7.098779f,20.00259f,6.7395196f)
                curveTo(20.62271f,6.3802605f,21.003204f,5.716662f,21.0f,5.0f)
                curveTo(21.003204f,4.283338f,20.62271f,3.6197395f,20.00259f,3.2604802f)
                curveTo(19.382473f,2.9012208f,18.617527f,2.9012208f,17.99741f,3.2604802f)
                curveTo(17.37729f,3.6197395f,16.996796f,4.283338f,17.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                curveTo(2.996795f,19.716661f,3.3772902f,20.38026f,3.997409f,20.73952f)
                curveTo(4.617528f,21.09878f,5.382472f,21.09878f,6.0025907f,20.73952f)
                curveTo(6.6227098f,20.38026f,7.003205f,19.716661f,7.0f,19.0f)
                curveTo(7.003205f,18.283339f,6.6227098f,17.61974f,6.0025907f,17.26048f)
                curveTo(5.382472f,16.90122f,4.617528f,16.90122f,3.997409f,17.26048f)
                curveTo(3.3772902f,17.61974f,2.996795f,18.283339f,3.0f,19.0f)
            }
}

public val LucideIcons.All.OrbitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Orbit: ImageVector
    @Composable get() = OrbitDefinition.asImageVector()
