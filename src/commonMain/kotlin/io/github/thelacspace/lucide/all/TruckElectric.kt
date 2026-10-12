package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TruckElectric") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,19.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,5.8954306f,13.104569f,5.0f,12.0f,5.0f)
                lineTo(9.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,19.0f)
                lineTo(9.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,19.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.552284f,19.0f,22.0f,18.552284f,22.0f,18.0f)
                lineTo(22.0f,14.35f)
                curveTo(21.998692f,14.124436f,21.921162f,13.90594f,21.78f,13.7300005f)
                lineTo(18.3f,9.38f)
                curveTo(18.111351f,9.141262f,17.82427f,9.001403f,17.519999f,9.0f)
                lineTo(14.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,18.552284f,2.4477153f,19.0f,3.0f,19.0f)
                lineTo(5.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(2.15f,5.15f)
                curveTo(1.9971541f,5.2898026f,1.9475187f,5.5099897f,2.0256007f,5.7018485f)
                curveTo(2.1036828f,5.8937073f,2.292968f,6.0166597f,2.5f,6.01f)
                lineTo(4.65f,6.01f)
                curveTo(4.8751864f,5.957303f,5.1052446f,6.076258f,5.1924233f,6.2904677f)
                curveTo(5.2796016f,6.5046773f,5.197989f,6.750475f,5.0f,6.8700004f)
                lineTo(3.0f,9.02f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,19.0f)
                curveTo(14.996795f,19.716661f,15.377291f,20.38026f,15.997409f,20.73952f)
                curveTo(16.617527f,21.09878f,17.382473f,21.09878f,18.00259f,20.73952f)
                curveTo(18.62271f,20.38026f,19.003204f,19.716661f,19.0f,19.0f)
                curveTo(19.003204f,18.283339f,18.62271f,17.61974f,18.00259f,17.26048f)
                curveTo(17.382473f,16.90122f,16.617527f,16.90122f,15.997409f,17.26048f)
                curveTo(15.377291f,17.61974f,14.996795f,18.283339f,15.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,19.0f)
                curveTo(4.996795f,19.716661f,5.3772902f,20.38026f,5.9974093f,20.73952f)
                curveTo(6.617528f,21.09878f,7.382472f,21.09878f,8.002591f,20.73952f)
                curveTo(8.622709f,20.38026f,9.003205f,19.716661f,9.0f,19.0f)
                curveTo(9.003205f,18.283339f,8.622709f,17.61974f,8.002591f,17.26048f)
                curveTo(7.382472f,16.90122f,6.617528f,16.90122f,5.9974093f,17.26048f)
                curveTo(5.3772902f,17.61974f,4.996795f,18.283339f,5.0f,19.0f)
            }
}

public val LucideIcons.All.TruckElectricDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TruckElectric: ImageVector
    @Composable get() = TruckElectricDefinition.asImageVector()
