package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandFist") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.035f,17.012f)
                curveTo(12.035f,15.3551445f,10.6918545f,14.011999f,9.035f,14.011999f)
                lineTo(8.724f,14.009999f)
                curveTo(8.433587f,14.008297f,8.172629f,13.832285f,8.062251f,13.563661f)
                curveTo(7.9518723f,13.295036f,8.013685f,12.986398f,8.219f,12.780999f)
                lineTo(9.414f,11.5859995f)
                curveTo(9.788985f,11.210901f,10.29761f,11.000113f,10.828f,11.0f)
                lineTo(12.0f,11.0f)
                curveTo(13.101078f,10.995076f,13.9910755f,10.1010895f,13.9910755f,9.0f)
                curveTo(13.9910755f,7.898911f,13.101078f,7.0049243f,12.0f,7.0f)
                lineTo(9.243f,7.0f)
                curveTo(8.447069f,6.9999046f,7.6837234f,7.316107f,7.1210003f,7.879f)
                lineTo(4.4140005f,10.586f)
                curveTo(3.5087717f,11.491587f,3.0001729f,12.719561f,3.0f,14.0f)
                curveTo(3.0f,18.418278f,6.581722f,22.0f,11.0f,22.0f)
                lineTo(13.0f,22.0f)
                curveTo(17.418278f,22.0f,21.0f,18.418278f,21.0f,14.0f)
                lineTo(21.0f,7.0f)
                curveTo(21.003204f,6.283338f,20.62271f,5.6197395f,20.00259f,5.2604804f)
                curveTo(19.382473f,4.901221f,18.617527f,4.901221f,17.99741f,5.2604804f)
                curveTo(17.37729f,5.6197395f,16.996796f,6.283338f,17.0f,7.0f)
                lineTo(17.0f,9.0f)
                curveTo(16.996796f,9.716661f,17.37729f,10.38026f,17.99741f,10.73952f)
                curveTo(18.617527f,11.098779f,19.382473f,11.098779f,20.00259f,10.73952f)
                curveTo(20.62271f,10.38026f,21.003204f,9.716661f,21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.888f,9.662f)
                curveTo(14.501484f,10.072376f,15.291121f,10.111511f,15.942177f,9.763807f)
                curveTo(16.593231f,9.416104f,16.999865f,8.738087f,17.0f,8.0f)
                lineTo(17.0f,5.0f)
                curveTo(17.003204f,4.283338f,16.62271f,3.6197395f,16.00259f,3.2604802f)
                curveTo(15.382472f,2.9012208f,14.617528f,2.9012208f,13.997409f,3.2604802f)
                curveTo(13.377291f,3.6197395f,12.996795f,4.283338f,13.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                curveTo(9.003205f,4.283338f,8.622709f,3.6197395f,8.002591f,3.2604802f)
                curveTo(7.382472f,2.9012208f,6.617528f,2.9012208f,5.9974093f,3.2604802f)
                curveTo(5.3772902f,3.6197395f,4.996795f,4.283338f,5.0f,5.0f)
                lineTo(5.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,7.0f)
                lineTo(9.0f,4.0f)
                curveTo(8.996795f,3.283338f,9.377291f,2.6197395f,9.997409f,2.2604802f)
                curveTo(10.617528f,1.9012209f,11.382472f,1.9012209f,12.002591f,2.2604802f)
                curveTo(12.622709f,2.6197395f,13.003205f,3.283338f,13.0f,4.0f)
                lineTo(13.0f,7.268f)
            }
}

public val LucideIcons.All.HandFistDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandFist: ImageVector
    @Composable get() = HandFistDefinition.asImageVector()
