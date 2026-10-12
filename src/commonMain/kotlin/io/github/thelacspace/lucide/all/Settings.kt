package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Settings") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.671f,4.136f)
                curveTo(9.7851715f,2.934843f,10.793929f,2.0174239f,12.0005f,2.0174239f)
                curveTo(13.20707f,2.0174239f,14.215828f,2.934843f,14.33f,4.136f)
                curveTo(14.397209f,4.8959413f,14.830661f,5.5754066f,15.491464f,5.9566774f)
                curveTo(16.152266f,6.337948f,16.957445f,6.3731484f,17.649f,6.051f)
                curveTo(18.745247f,5.553293f,20.040245f,5.968636f,20.642515f,7.011105f)
                curveTo(21.244785f,8.053574f,20.957747f,9.382912f,19.979f,10.084f)
                curveTo(19.354704f,10.522049f,18.983046f,11.236851f,18.983046f,11.9995f)
                curveTo(18.983046f,12.762149f,19.354704f,13.476951f,19.979f,13.915f)
                curveTo(20.957748f,14.616087f,21.244787f,15.945426f,20.642517f,16.987896f)
                curveTo(20.040247f,18.030365f,18.745247f,18.445707f,17.649f,17.948f)
                curveTo(16.957445f,17.62585f,16.152266f,17.661053f,15.491464f,18.042322f)
                curveTo(14.830661f,18.423594f,14.39721f,19.103058f,14.33f,19.862999f)
                curveTo(14.215828f,21.064156f,13.20707f,21.981575f,12.0005f,21.981575f)
                curveTo(10.793929f,21.981575f,9.7851715f,21.064156f,9.671f,19.862999f)
                curveTo(9.603912f,19.10278f,9.170316f,18.423038f,8.5092325f,18.041721f)
                curveTo(7.84815f,17.660404f,7.04265f,17.625423f,6.351f,17.947998f)
                curveTo(5.254752f,18.445705f,3.9597526f,18.030363f,3.3574827f,16.987894f)
                curveTo(2.755213f,15.945424f,3.0422513f,14.616085f,4.021f,13.914998f)
                curveTo(4.645297f,13.476949f,5.016954f,12.762147f,5.016954f,11.999498f)
                curveTo(5.016954f,11.236849f,4.645297f,10.522047f,4.021f,10.083998f)
                curveTo(3.043685f,9.382593f,2.7574067f,8.054449f,3.3589928f,7.0127163f)
                curveTo(3.960579f,5.970984f,5.2540092f,5.5550995f,6.35f,6.051f)
                curveTo(7.0415545f,6.3731484f,7.846734f,6.337948f,8.507537f,5.956677f)
                curveTo(9.168339f,5.5754066f,9.60179f,4.8959413f,9.669f,4.136f)
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
}

public val LucideIcons.All.SettingsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Settings: ImageVector
    @Composable get() = SettingsDefinition.asImageVector()
