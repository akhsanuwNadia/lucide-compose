package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandGrab") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,11.5f)
                lineTo(18.0f,9.0f)
                curveTo(18.0f,7.8954306f,17.10457f,7.0f,16.0f,7.0f)
                curveTo(14.895431f,7.0f,14.0f,7.8954306f,14.0f,9.0f)
                lineTo(14.0f,10.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                lineTo(14.0f,8.0f)
                curveTo(14.0f,6.8954306f,13.104569f,6.0f,12.0f,6.0f)
                curveTo(10.895431f,6.0f,10.0f,6.8954306f,10.0f,8.0f)
                lineTo(10.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,9.9f)
                lineTo(10.0f,9.0f)
                curveTo(10.0f,7.8954306f,9.104569f,7.0f,8.0f,7.0f)
                curveTo(6.8954306f,7.0f,6.0f,7.8954306f,6.0f,9.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                curveTo(6.0f,12.895431f,5.1045694f,12.0f,4.0f,12.0f)
                curveTo(2.8954306f,12.0f,2.0f,12.895431f,2.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,11.0f)
                curveTo(17.996796f,10.283339f,18.37729f,9.61974f,18.99741f,9.26048f)
                curveTo(19.617527f,8.901221f,20.382473f,8.901221f,21.00259f,9.26048f)
                curveTo(21.62271f,9.61974f,22.003204f,10.283339f,22.0f,11.0f)
                lineTo(22.0f,14.0f)
                curveTo(22.0f,18.418278f,18.418278f,22.0f,14.0f,22.0f)
                lineTo(10.0f,22.0f)
                curveTo(5.581722f,22.0f,2.0f,18.418278f,2.0f,14.0f)
                curveTo(1.9967949f,13.283339f,2.3772902f,12.61974f,2.997409f,12.26048f)
                curveTo(3.617528f,11.901221f,4.382472f,11.901221f,5.0025907f,12.26048f)
                curveTo(5.6227098f,12.61974f,6.003205f,13.283339f,6.0f,14.0f)
            }
}

public val LucideIcons.All.HandGrabDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandGrab: ImageVector
    @Composable get() = HandGrabDefinition.asImageVector()
