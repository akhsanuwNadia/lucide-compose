package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("University") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,21.0f)
                lineTo(14.0f,18.0f)
                curveTo(13.995076f,16.898922f,13.1010895f,16.008924f,12.0f,16.008924f)
                curveTo(10.8989105f,16.008924f,10.004924f,16.898922f,10.0f,18.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(18.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,16.0f)
                lineTo(18.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                curveTo(22.0f,6.4477153f,21.552284f,6.0f,21.0f,6.0f)
                lineTo(19.0f,6.0f)
                curveTo(18.591267f,5.99994f,18.192366f,5.8746505f,17.857f,5.641f)
                lineTo(13.143f,2.36f)
                curveTo(12.456295f,1.8813047f,11.544123f,1.8809057f,10.856999f,2.359f)
                lineTo(6.143f,5.64f)
                curveTo(5.807751f,5.8740053f,5.40884f,5.9996467f,5.0f,6.0f)
                lineTo(3.0f,6.0f)
                curveTo(2.4477153f,6.0f,2.0f,6.4477153f,2.0f,7.0f)
                lineTo(2.0f,19.0f)
                curveTo(2.0f,20.10457f,2.8954306f,21.0f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(21.10457f,21.0f,22.0f,20.10457f,22.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(6.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                lineTo(6.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                curveTo(9.996795f,10.716661f,10.377291f,11.38026f,10.997409f,11.73952f)
                curveTo(11.617528f,12.098779f,12.382472f,12.098779f,13.002591f,11.73952f)
                curveTo(13.622709f,11.38026f,14.003205f,10.716661f,14.0f,10.0f)
                curveTo(14.003205f,9.283339f,13.622709f,8.61974f,13.002591f,8.26048f)
                curveTo(12.382472f,7.901221f,11.617528f,7.901221f,10.997409f,8.26048f)
                curveTo(10.377291f,8.61974f,9.996795f,9.283339f,10.0f,10.0f)
            }
}

public val LucideIcons.All.UniversityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.University: ImageVector
    @Composable get() = UniversityDefinition.asImageVector()
