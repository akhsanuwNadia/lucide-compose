package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Puzzle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.39f,4.39f)
                curveTo(15.64596f,4.646218f,16.020449f,4.7440186f,16.369005f,4.645676f)
                curveTo(16.717562f,4.5473332f,16.985706f,4.268218f,17.07f,3.916f)
                curveTo(17.357252f,2.720275f,18.471445f,1.9110245f,19.697384f,2.007704f)
                curveTo(20.923323f,2.1043835f,21.896894f,3.0782785f,21.993168f,4.304249f)
                curveTo(22.08944f,5.5302196f,21.27982f,6.6441445f,20.084f,6.9309998f)
                curveTo(19.731781f,7.015293f,19.452665f,7.2834373f,19.354322f,7.6319942f)
                curveTo(19.25598f,7.9805512f,19.35378f,8.355041f,19.609999f,8.611f)
                lineTo(21.293f,10.293f)
                curveTo(21.745739f,10.745717f,22.000088f,11.359746f,22.000088f,12.0f)
                curveTo(22.000088f,12.640255f,21.745739f,13.254284f,21.293f,13.707001f)
                lineTo(19.61f,15.39f)
                curveTo(19.35404f,15.646218f,18.979551f,15.74402f,18.630995f,15.645678f)
                curveTo(18.282438f,15.547335f,18.014294f,15.268219f,17.93f,14.916f)
                curveTo(17.642748f,13.720275f,16.528555f,12.911024f,15.302616f,13.007704f)
                curveTo(14.076678f,13.104383f,13.103106f,14.078279f,13.006833f,15.304249f)
                curveTo(12.91056f,16.53022f,13.72018f,17.644144f,14.916f,17.931f)
                curveTo(15.268219f,18.015293f,15.547335f,18.283438f,15.645678f,18.631994f)
                curveTo(15.74402f,18.98055f,15.646218f,19.35504f,15.39f,19.611f)
                lineTo(13.707001f,21.293f)
                curveTo(13.254284f,21.745739f,12.640255f,22.000088f,12.000001f,22.000088f)
                curveTo(11.359747f,22.000088f,10.745718f,21.745739f,10.293001f,21.293f)
                lineTo(8.61f,19.61f)
                curveTo(8.35404f,19.353783f,7.979551f,19.255981f,7.6309943f,19.354324f)
                curveTo(7.2824373f,19.452667f,7.014293f,19.731783f,6.93f,20.084002f)
                curveTo(6.6427484f,21.279726f,5.5285544f,22.088978f,4.302616f,21.992298f)
                curveTo(3.0766776f,21.895618f,2.1031053f,20.921724f,2.0068324f,19.695753f)
                curveTo(1.9105595f,18.469782f,2.7201796f,17.355858f,3.916f,17.069002f)
                curveTo(4.2682185f,16.984709f,4.547334f,16.716564f,4.6456766f,16.368008f)
                curveTo(4.7440195f,16.019451f,4.6462183f,15.644961f,4.39f,15.389002f)
                lineTo(2.7069998f,13.707002f)
                curveTo(2.2542598f,13.254285f,1.9999111f,12.640256f,1.9999111f,12.000002f)
                curveTo(1.9999111f,11.359747f,2.2542598f,10.745718f,2.7069998f,10.293001f)
                lineTo(4.39f,8.61f)
                curveTo(4.64596f,8.353782f,5.020448f,8.2559805f,5.3690047f,8.354323f)
                curveTo(5.7175617f,8.452666f,5.985706f,8.731781f,6.0699997f,9.084f)
                curveTo(6.3572516f,10.279724f,7.4714456f,11.088975f,8.697384f,10.992295f)
                curveTo(9.923322f,10.895616f,10.896894f,9.9217205f,10.993167f,8.69575f)
                curveTo(11.089439f,7.4697795f,10.2798195f,6.3558545f,9.084f,6.0689993f)
                curveTo(8.731781f,5.9847054f,8.452666f,5.7165613f,8.354323f,5.3680043f)
                curveTo(8.2559805f,5.019448f,8.353782f,4.6449594f,8.61f,4.3889995f)
                lineTo(10.292999f,2.7069993f)
                curveTo(10.745716f,2.2542596f,11.359745f,1.9999111f,11.999999f,1.9999111f)
                curveTo(12.640253f,1.9999111f,13.254282f,2.2542596f,13.706999f,2.7069993f)
                close()
            }
}

public val LucideIcons.All.PuzzleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Puzzle: ImageVector
    @Composable get() = PuzzleDefinition.asImageVector()
