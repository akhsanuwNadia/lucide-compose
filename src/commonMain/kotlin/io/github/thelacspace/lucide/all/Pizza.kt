package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pizza") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(11.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.75,18.25)
                lineTo(12.5,19.670000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(17.774999618530273,5.6539998054504395)
                curveTo(11.688584327697754,6.932663917541504,6.933165550231934,11.687689781188965,5.653999328613281,17.77400016784668)
            }
            lucidePath(strokeWidth) {
                moveTo(18.799999237060547,9.300000190734863)
                curveTo(16.683008193969727,9.887545585632324,15.439106941223145,12.07571792602539,16.017179489135742,14.19531536102295)
                curveTo(16.595251083374023,16.314910888671875,18.77783966064453,17.568586349487305,20.899999618530273,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.964000701904297,20.73200035095215)
                curveTo(22.061031341552734,21.079681396484375,21.96315574645996,21.45267105102539,21.70791244506836,21.70791244506836)
                curveTo(21.45267105102539,21.96315574645996,21.079681396484375,22.061031341552734,20.73200035095215,21.964000701904297)
                lineTo(2.7320003509521484,16.964000701904297)
                curveTo(2.4764325618743896,16.892839431762695,2.2596144676208496,16.72304344177246,2.129268169403076,16.49198341369629)
                curveTo(1.9989218711853027,16.260923385620117,1.9657307863235474,15.98753833770752,2.0370004177093506,15.732000350952148)
                curveTo(3.8843915462493896,9.081180572509766,9.081180572509766,3.8843913078308105,15.732000350952148,2.0369999408721924)
                curveTo(15.98753833770752,1.9657303094863892,16.260923385620117,1.9989213943481445,16.49198341369629,2.129267692565918)
                curveTo(16.72304344177246,2.2596139907836914,16.892839431762695,2.4764320850372314,16.964000701904297,2.7319998741149902)
                close()
            }
}

public val LucideIcons.All.PizzaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pizza: ImageVector
    @Composable get() = PizzaDefinition.asImageVector()
