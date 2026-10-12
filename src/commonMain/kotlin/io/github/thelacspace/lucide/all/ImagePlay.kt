package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImagePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,15.003f)
                curveTo(14.99891f,14.641666f,15.192832f,14.307848f,15.507257f,14.129805f)
                curveTo(15.821684f,13.951761f,16.207703f,13.957188f,16.517f,14.144f)
                lineTo(21.514f,17.141f)
                curveTo(21.816635f,17.321375f,22.002026f,17.647692f,22.002026f,18.0f)
                curveTo(22.002026f,18.35231f,21.816635f,18.678627f,21.514f,18.859001f)
                lineTo(16.517f,21.856f)
                curveTo(16.20755f,22.042908f,15.821314f,22.048243f,15.50682f,21.869953f)
                curveTo(15.192326f,21.691664f,14.998547f,21.357513f,15.0f,20.996f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.17f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(11.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,21.0f)
                lineTo(11.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,9.0f)
                curveTo(6.996795f,9.716661f,7.3772902f,10.38026f,7.9974093f,10.73952f)
                curveTo(8.617528f,11.098779f,9.382472f,11.098779f,10.002591f,10.73952f)
                curveTo(10.622709f,10.38026f,11.003205f,9.716661f,11.0f,9.0f)
                curveTo(11.003205f,8.283339f,10.622709f,7.6197395f,10.002591f,7.2604804f)
                curveTo(9.382472f,6.901221f,8.617528f,6.901221f,7.9974093f,7.2604804f)
                curveTo(7.3772902f,7.6197395f,6.996795f,8.283339f,7.0f,9.0f)
            }
}

public val LucideIcons.All.ImagePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImagePlay: ImageVector
    @Composable get() = ImagePlayDefinition.asImageVector()
