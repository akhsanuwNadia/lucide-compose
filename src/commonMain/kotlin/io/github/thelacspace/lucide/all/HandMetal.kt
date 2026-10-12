package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandMetal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,12.5f)
                lineTo(18.0f,10.0f)
                curveTo(18.0f,8.895431f,17.10457f,8.0f,16.0f,8.0f)
                curveTo(14.895431f,8.0f,14.0f,8.895431f,14.0f,10.0f)
                lineTo(14.0f,11.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,11.0f)
                lineTo(14.0f,9.0f)
                curveTo(14.003205f,8.283339f,13.622709f,7.6197395f,13.002591f,7.2604804f)
                curveTo(12.382472f,6.901221f,11.617528f,6.901221f,10.997409f,7.2604804f)
                curveTo(10.377291f,7.6197395f,9.996795f,8.283339f,10.0f,9.0f)
                lineTo(10.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,10.5f)
                lineTo(10.0f,5.0f)
                curveTo(10.003205f,4.283338f,9.622709f,3.6197395f,9.002591f,3.2604802f)
                curveTo(8.382472f,2.9012208f,7.617528f,2.9012208f,6.9974093f,3.2604802f)
                curveTo(6.3772902f,3.6197395f,5.996795f,4.283338f,6.0f,5.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                lineTo(5.24f,13.24f)
                curveTo(4.4510856f,12.522587f,3.2380672f,12.550286f,2.4827225f,13.302962f)
                curveTo(1.7273775f,14.055638f,1.6953845f,15.268551f,2.4099998f,16.06f)
                lineTo(6.0099998f,19.66f)
                curveTo(7.5f,21.14f,9.2f,22.0f,12.0f,22.0f)
                lineTo(14.0f,22.0f)
                curveTo(18.418278f,22.0f,22.0f,18.418278f,22.0f,14.0f)
                lineTo(22.0f,7.0f)
                curveTo(22.003204f,6.283338f,21.62271f,5.6197395f,21.00259f,5.2604804f)
                curveTo(20.382473f,4.901221f,19.617527f,4.901221f,18.99741f,5.2604804f)
                curveTo(18.37729f,5.6197395f,17.996796f,6.283338f,18.0f,7.0f)
                lineTo(18.0f,12.0f)
            }
}

public val LucideIcons.All.HandMetalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandMetal: ImageVector
    @Composable get() = HandMetalDefinition.asImageVector()
