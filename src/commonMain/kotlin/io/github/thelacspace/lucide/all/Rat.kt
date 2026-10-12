package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(2.8989217f,21.995075f,2.0089242f,21.10109f,2.0089242f,20.0f)
                curveTo(2.0089242f,18.89891f,2.8989217f,18.004925f,4.0f,18.0f)
                lineTo(16.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.236f,18.0f)
                curveTo(14.020488f,17.123085f,14.2199335f,15.868535f,13.746069f,14.79157f)
                curveTo(13.272204f,13.714604f,12.2125225f,13.0140705f,11.036f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,9.0f)
                lineTo(16.01f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.82f,3.94f)
                curveTo(17.66859f,3.0416396f,18.981232f,2.7555501f,20.126696f,3.2193081f)
                curveTo(21.272158f,3.683066f,22.016048f,4.8017726f,22.000637f,6.0374584f)
                curveTo(21.985228f,7.2731447f,21.21367f,8.372952f,20.057f,8.808001f)
                lineTo(21.872f,11.395f)
                curveTo(22.085823f,11.879686f,22.028128f,12.441216f,21.720213f,12.872296f)
                curveTo(21.4123f,13.303376f,20.899834f,13.540071f,20.372f,13.495001f)
                lineTo(17.5f,13.042001f)
                curveTo(16.62201f,12.893503f,15.72342f,13.142716f,15.047332f,13.72222f)
                curveTo(14.3712435f,14.301725f,13.987531f,15.151627f,14.0f,16.042f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,4.988f)
                curveTo(16.994444f,3.6457765f,16.098f,2.4705777f,14.804984f,2.1104298f)
                curveTo(13.51197f,1.7502819f,12.1370735f,2.292837f,11.43844f,3.4389198f)
                curveTo(10.739807f,4.585003f,10.887468f,6.055683f,11.8f,7.04f)
                curveTo(9.813625f,6.8114796f,7.8243394f,7.443309f,6.3338714f,8.776131f)
                curveTo(4.843404f,10.1089525f,3.994039f,12.0155325f,4.0f,14.015f)
                curveTo(4.0082626f,16.218279f,5.7967057f,18.000015f,8.0f,18.0f)
            }
}

public val LucideIcons.All.RatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rat: ImageVector
    @Composable get() = RatDefinition.asImageVector()
