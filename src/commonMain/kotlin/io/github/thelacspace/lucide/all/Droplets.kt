package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Droplets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,16.299999237060547)
                curveTo(9.199999809265137,16.299999237060547,11.0,14.469999313354492,11.0,12.249999046325684)
                curveTo(11.0,11.089999198913574,10.430000305175781,9.989998817443848,9.289999961853027,9.059999465942383)
                curveTo(8.149999618530273,8.130000114440918,7.289999961853027,6.75,7.0,5.300000190734863)
                curveTo(6.710000038146973,6.75,5.860000133514404,8.140000343322754,4.710000038146973,9.0600004196167)
                curveTo(3.559999942779541,9.980000495910645,3.0,11.100000381469727,3.0,12.25)
                curveTo(3.0,14.470000267028809,4.800000190734863,16.299999237060547,7.0,16.299999237060547)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.5600004196167,6.599999904632568)
                curveTo(13.247758865356445,5.501124858856201,13.735300064086914,4.28904390335083,14.0,3.0199999809265137)
                curveTo(14.5,5.519999980926514,16.0,7.920000076293945,18.0,9.520000457763672)
                curveTo(20.0,11.120000839233398,21.0,13.020000457763672,21.0,15.020000457763672)
                curveTo(21.011686325073242,17.846948623657227,19.317060470581055,20.40179443359375,16.7081298828125,21.490489959716797)
                curveTo(14.099202156066895,22.579187393188477,11.091215133666992,21.986724853515625,9.09000015258789,19.989999771118164)
            }
}

public val LucideIcons.All.DropletsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Droplets: ImageVector
    @Composable get() = DropletsDefinition.asImageVector()
