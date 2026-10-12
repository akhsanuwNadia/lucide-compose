package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.25,16.25)
                lineTo(12.75,16.25)
                lineTo(12.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(16.0,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(4.420000076293945,11.246999740600586)
                curveTo(4.140131950378418,12.327704429626465,3.9989969730377197,13.439644813537598,4.0,14.555999755859375)
                curveTo(4.0,18.72800064086914,7.581999778747559,21.0,12.0,21.0)
                curveTo(16.417999267578125,21.0,20.0,18.72800064086914,20.0,14.555999755859375)
                curveTo(19.994998931884766,13.435080528259277,19.828969955444336,12.320694923400879,19.506999969482422,11.246999740600586)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(8.0,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,8.5)
                curveTo(8.116000175476074,9.550000190734863,7.416999816894531,10.527999877929688,6.156000137329102,11.0)
                curveTo(4.225000381469727,11.722000122070312,2.580000162124634,10.70300006866455,2.500000238418579,10.0)
                curveTo(2.387000322341919,9.005999565124512,3.6770002841949463,3.4699997901916504,6.5,3.0)
                curveTo(8.42300033569336,2.678999900817871,10.151000022888184,3.8450000286102295,10.151000022888184,5.234999656677246)
                curveTo(11.415789604187012,4.913778781890869,12.742520332336426,4.928256034851074,14.0,5.2769999504089355)
                curveTo(14.0,3.88700008392334,15.843999862670898,2.678999900817871,17.767000198364258,3.0)
                curveTo(20.59000015258789,3.4700000286102295,21.880001068115234,9.006000518798828,21.767000198364258,10.0)
                curveTo(21.687000274658203,10.70300006866455,20.04199981689453,11.722000122070312,18.111000061035156,11.0)
                curveTo(16.850000381469727,10.527999877929688,16.256000518798828,9.550000190734863,15.871999740600586,8.5)
            }
}

public val LucideIcons.All.DogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dog: ImageVector
    @Composable get() = DogDefinition.asImageVector()
