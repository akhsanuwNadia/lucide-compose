package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VectorPolygon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.828f,4.813f)
                lineTo(18.172f,7.188f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.769f,18.153f)
                lineTo(19.23f,9.847f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.687f,14.074f)
                lineTo(13.312f,18.926f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.772f,5.579f)
                lineTo(5.228f,11.42f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,4.0f)
                curveTo(8.996795f,4.716662f,9.377291f,5.3802605f,9.997409f,5.7395196f)
                curveTo(10.617528f,6.098779f,11.382472f,6.098779f,12.002591f,5.7395196f)
                curveTo(12.622709f,5.3802605f,13.003205f,4.716662f,13.0f,4.0f)
                curveTo(13.003205f,3.283338f,12.622709f,2.6197395f,12.002591f,2.2604802f)
                curveTo(11.382472f,1.9012209f,10.617528f,1.9012209f,9.997409f,2.2604802f)
                curveTo(9.377291f,2.6197395f,8.996795f,3.283338f,9.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,20.0f)
                curveTo(12.996795f,20.716661f,13.377291f,21.38026f,13.997409f,21.73952f)
                curveTo(14.617528f,22.09878f,15.382472f,22.09878f,16.00259f,21.73952f)
                curveTo(16.62271f,21.38026f,17.003204f,20.716661f,17.0f,20.0f)
                curveTo(17.003204f,19.283339f,16.62271f,18.61974f,16.00259f,18.26048f)
                curveTo(15.382472f,17.90122f,14.617528f,17.90122f,13.997409f,18.26048f)
                curveTo(13.377291f,18.61974f,12.996795f,19.283339f,13.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                curveTo(17.996796f,8.716661f,18.37729f,9.38026f,18.99741f,9.73952f)
                curveTo(19.617527f,10.098779f,20.382473f,10.098779f,21.00259f,9.73952f)
                curveTo(21.62271f,9.38026f,22.003204f,8.716661f,22.0f,8.0f)
                curveTo(22.003204f,7.283338f,21.62271f,6.6197395f,21.00259f,6.2604804f)
                curveTo(20.382473f,5.901221f,19.617527f,5.901221f,18.99741f,6.2604804f)
                curveTo(18.37729f,6.6197395f,17.996796f,7.283338f,18.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                curveTo(1.9967949f,13.716661f,2.3772902f,14.38026f,2.997409f,14.73952f)
                curveTo(3.617528f,15.098779f,4.382472f,15.098779f,5.0025907f,14.73952f)
                curveTo(5.6227098f,14.38026f,6.003205f,13.716661f,6.0f,13.0f)
                curveTo(6.003205f,12.283339f,5.6227098f,11.61974f,5.0025907f,11.26048f)
                curveTo(4.382472f,10.901221f,3.617528f,10.901221f,2.997409f,11.26048f)
                curveTo(2.3772902f,11.61974f,1.9967949f,12.283339f,2.0f,13.0f)
            }
}

public val LucideIcons.All.VectorPolygonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VectorPolygon: ImageVector
    @Composable get() = VectorPolygonDefinition.asImageVector()
