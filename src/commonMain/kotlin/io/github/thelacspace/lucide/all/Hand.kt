package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,11.0f)
                lineTo(18.0f,6.0f)
                curveTo(18.0f,4.8954306f,17.10457f,4.0f,16.0f,4.0f)
                curveTo(14.895431f,4.0f,14.0f,4.8954306f,14.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                lineTo(14.0f,4.0f)
                curveTo(14.0f,2.8954306f,13.104569f,2.0f,12.0f,2.0f)
                curveTo(10.895431f,2.0f,10.0f,2.8954306f,10.0f,4.0f)
                lineTo(10.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,10.5f)
                lineTo(10.0f,6.0f)
                curveTo(10.0f,4.8954306f,9.104569f,4.0f,8.0f,4.0f)
                curveTo(6.8954306f,4.0f,6.0f,4.8954306f,6.0f,6.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                curveTo(17.996796f,7.283338f,18.37729f,6.6197395f,18.99741f,6.2604804f)
                curveTo(19.617527f,5.901221f,20.382473f,5.901221f,21.00259f,6.2604804f)
                curveTo(21.62271f,6.6197395f,22.003204f,7.283338f,22.0f,8.0f)
                lineTo(22.0f,14.0f)
                curveTo(22.0f,18.418278f,18.418278f,22.0f,14.0f,22.0f)
                lineTo(12.0f,22.0f)
                curveTo(9.2f,22.0f,7.5f,21.14f,6.01f,19.66f)
                lineTo(2.4100003f,16.06f)
                curveTo(1.695385f,15.268551f,1.727378f,14.055638f,2.482723f,13.302962f)
                curveTo(3.2380676f,12.550286f,4.451086f,12.522587f,5.2400002f,13.24f)
                lineTo(7.0f,15.0f)
            }
}

public val LucideIcons.All.HandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hand: ImageVector
    @Composable get() = HandDefinition.asImageVector()
