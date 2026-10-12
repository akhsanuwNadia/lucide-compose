package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunMoon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.836999893188477,16.385000228881836)
                curveTo(14.15524959564209,19.26087760925293,11.480720520019531,21.21192741394043,8.534021377563477,20.98297882080078)
                curveTo(5.5873212814331055,20.7540283203125,3.2462518215179443,18.413284301757812,3.016894578933716,15.466615676879883)
                curveTo(2.7875373363494873,12.519947052001953,4.738216400146484,9.845149040222168,7.613999843597412,9.163000106811523)
                curveTo(8.23799991607666,9.015999794006348,8.583999633789062,9.822999954223633,8.328999519348145,10.41100025177002)
                curveTo(7.677633285522461,11.916829109191895,8.011855125427246,13.667725563049316,9.17209529876709,14.827744483947754)
                curveTo(10.332334518432617,15.987763404846191,12.083293914794922,16.321653366088867,13.58899974822998,15.670000076293945)
                curveTo(14.177999496459961,15.414999961853027,14.984999656677246,15.760000228881836,14.836999893188477,16.385000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                curveTo(16.0,9.790861129760742,14.209138870239258,8.0,12.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                lineTo(17.743999481201172,6.25600004196167)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(22.0,12.0)
            }
}

public val LucideIcons.All.SunMoonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunMoon: ImageVector
    @Composable get() = SunMoonDefinition.asImageVector()
