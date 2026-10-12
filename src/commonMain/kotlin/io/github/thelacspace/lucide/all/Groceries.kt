package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Groceries") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(14.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.424f,11.095f)
                curveTo(19.956656f,10.452242f,20.133348f,9.586032f,19.895f,8.786f)
                curveTo(20.488045f,8.487445f,20.894264f,7.914042f,20.97923f,7.255546f)
                curveTo(21.064198f,6.59705f,20.816835f,5.9393144f,20.319f,5.5f)
                curveTo(21.057014f,4.8448777f,21.206879f,3.749375f,20.671926f,2.920112f)
                curveTo(20.136974f,2.0908487f,19.077126f,1.7757243f,18.176f,2.178f)
                curveTo(17.917597f,2.2954667f,17.687157f,2.4665918f,17.5f,2.6799998f)
                curveTo(17.060719f,2.181719f,16.402704f,1.9340562f,15.743895f,2.019038f)
                curveTo(15.085084f,2.1040199f,14.511457f,2.510556f,14.213f,3.1039999f)
                curveTo(13.513338f,2.896205f,12.757807f,3.0045419f,12.144728f,3.4005725f)
                curveTo(11.53165f,3.7966034f,11.122252f,4.440776f,11.024f,5.1639996f)
                curveTo(9.639074f,5.6417465f,8.801757f,7.0498967f,9.043406f,8.494842f)
                curveTo(9.285055f,9.939788f,10.534987f,10.99887f,12.0f,11.0f)
                lineTo(16.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.006f)
                curveTo(3.998404f,11.740782f,4.1022334f,11.485793f,4.2886453f,11.297131f)
                curveTo(4.4750576f,11.108468f,4.728782f,11.001587f,4.994f,11.0f)
                lineTo(19.0f,11.0f)
                curveTo(19.552284f,11.0f,20.0f,11.447715f,20.0f,12.0f)
                lineTo(20.0f,19.0f)
                curveTo(20.0f,20.10457f,19.10457f,21.0f,18.0f,21.0f)
                lineTo(6.0f,21.0f)
                curveTo(4.8954306f,21.0f,4.0f,20.10457f,4.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,11.0f)
                curveTo(4.790861f,11.0f,3.0f,9.209139f,3.0f,7.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,4.4477153f,3.4477153f,4.0f,4.0f,4.0f)
                lineTo(6.0f,4.0f)
                curveTo(7.5197763f,3.999664f,8.908459f,4.8606167f,9.584f,6.222f)
            }
}

public val LucideIcons.All.GroceriesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Groceries: ImageVector
    @Composable get() = GroceriesDefinition.asImageVector()
